# Scalar DB Server

Scalar DB Server is a gRPC server that implements Scalar DB interface. 
With Scalar DB Server, you can use Scalar DB features from multiple programming languages that are supported by gRPC.

Currently, we provide only a Java client officially, and we will support other language clients officially in the future.
Of course, you can generate language-specific client stubs by yourself.
However, note that it is not necessarily straightforward to implement a client since it's using a bidirectional streaming RPC in gRPC, and you need to be familiar with it.

This document explains how to install and use Scalar DB Server.

## Install prerequisites

Scalar DB Server is written in Java. So the following software is required to run it.

* [Oracle JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (OpenJDK 8) or higher

## Install Scalar DB Server

We have Docker images in [our repository](https://github.com/orgs/scalar-labs/packages/container/package/scalardb-server) and zip archives of Scalar DB Server available in [releases](https://github.com/scalar-labs/scalardb/releases).

If you are interested in building from source, run the following command: 

```shell
$ ./gradlew installDist
```

Of course, you can archive the jar and libraries by `./gradlew distZip` and so on.

## Configure Scalar DB Server

You need a property file holding the configuration for Scalar DB Server. 
It contains two sections: Scalar DB Server configurations and underlying storage/database configurations.

```properties
#
# Scalar DB Server configurations
#

# Port number of Scalar DB Server. 60051 by default
scalar.db.server.port=60051

# Prometheus exporter port. Use 8080 if this is not given. Prometheus exporter will not be started if a negative number is given.
scalar.db.server.prometheus_exporter_port=8080

#
# Underlying storage/database configurations
#

# Comma separated contact points. For DynamoDB, the region is specified by this parameter.
scalar.db.contact_points=localhost

# Port number for all the contact points. Default port number for each database is used if empty.
#scalar.db.contact_port=

# Credential information to access the database. For Cosmos DB, username isn't used. For DynamoDB, AWS_ACCESS_KEY_ID is specified by the username and AWS_ACCESS_SECRET_KEY is specified by the password.
scalar.db.username=cassandra
scalar.db.password=cassandra

# Storage implementation. "cassandra" or "cosmos" or "dynamo" or "jdbc" or "grpc" can be set. Default storage is "cassandra".
scalar.db.storage=cassandra

# The type of the transaction manager. "consensus-commit" or "jdbc" or "grpc" can be set. The default is "consensus-commit".
scalar.db.transaction_manager=consensus-commit

# Isolation level used for ConsensusCommit. Either SNAPSHOT or SERIALIZABLE can be specified. SNAPSHOT is used by default.
scalar.db.consensus_commit.isolation_level=SNAPSHOT

# Serializable strategy used for ConsensusCommit transaction manager.
# Either EXTRA_READ or EXTRA_WRITE can be specified. EXTRA_READ is used by default.
# If SNAPSHOT is specified in the property "scalar.db.consensus_commit.isolation_level", this is ignored.
scalar.db.consensus_commit.serializable_strategy=

# This is only usable for Consensus Commit.
# If set to "true", Get and Scan operations results will contain transaction metadata. To see the transaction metadata columns details for a given table, you can use the `DistributedTransactionAdmin.getTableMetadata()`
# method which will return the table metadata augmented with the transaction metadata columns. Using this configuration can be useful to investigate transaction related issues.
# The default is false.
scalar.db.consensus_commit.include_metadata.enabled=false
```

## Start Scalar DB Server

### Docker images

For Docker images, you need to pull the Scalar DB Server image first:
```shell
$ docker pull ghcr.io/scalar-labs/scalardb-server:<version>
```

And then, you can start Scalar DB Server with the following command:
```shell
$ docker run -v <your local property file path>:/scalardb/server/database.properties.tmpl -d -p 60051:60051 -p 8080:8080 ghcr.io/scalar-labs/scalardb-server:<version>
```

You can also start it with DEBUG logging as follows:
```shell
$ docker run -v <your local property file path>:/scalardb/server/database.properties.tmpl -e SCALAR_DB_LOG_LEVEL=DEBUG -d -p 60051:60051 -p 8080:8080 ghcr.io/scalar-labs/scalardb-server:<version>
````

You can also start it with your custom log configuration as follows:
```shell
$ docker run -v <your local property file path>:/scalardb/server/database.properties.tmpl -v <your custom log4j2 configuration file path>:/scalardb/server/log4j2.properties.tmpl -d -p 60051:60051 -p 8080:8080 ghcr.io/scalar-labs/scalardb-server:<version>
```

You can also start it with environment variables as follows:
```shell
$ docker run --env SCALAR_DB_CONTACT_POINTS=cassandra --env SCALAR_DB_CONTACT_PORT=9042 --env SCALAR_DB_USERNAME=cassandra --env SCALAR_DB_PASSWORD=cassandra --env SCALAR_DB_STORAGE=cassandra -d -p 60051:60051 -p 8080:8080 ghcr.io/scalar-labs/scalardb-server:<version>
```

You can also start it with JMX as follows:
```shell
$ docker run -v <your local property file path>:/scalardb/server/database.properties.tmpl -e JAVA_OPTS="-Dlog4j.configurationFile=file:log4j2.properties -Djava.rmi.server.hostname=<your container hostname or IP address> -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote=true -Dcom.sun.management.jmxremote.local.only=false -Dcom.sun.management.jmxremote.port=9990 -Dcom.sun.management.jmxremote.rmi.port=9990 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false" -d -p 60051:60051 -p 8080:8080 -p 9990:9990 ghcr.io/scalar-labs/scalardb-server:<version>
```

### Zip archives

For zip archives, you can start Scalar DB Server with the following commands:

```shell
$ unzip scalardb-server-<version>.zip
$ cd scalardb-server-<version>
$ export JAVA_OPTS="<your JVM options>"
$ bin/scalardb-server --config <your property file path>
```

## Usage of the Java client of Scalar DB Server

You can use the Java client of Scalar DB Server in almost the same way as other storages/databases.
The difference is that you need to set `scalar.db.storage` and `scalar.db.transaction_manager` to `grpc` in your client side property file.

```properties
# Comma separated contact points
scalar.db.contact_points=<Scalar DB Server host>

# Port number for all the contact points
scalar.db.contact_port=60051

# Storage implementation
scalar.db.storage=grpc

# The type of the transaction manager
scalar.db.transaction_manager=grpc

# The deadline duration for gRPC connections. The default is 60000 milliseconds (60 seconds)
scalar.db.grpc.deadline_duration_millis=60000
```

## Further reading

Please see the following sample to learn Scalar DB Server further:

- [Scalar DB Server Sample](https://github.com/scalar-labs/scalardb-samples/tree/main/scalardb-server-sample)

Please also see the following documents to learn how to deploy Scalar DB Server:

- [Deploy Scalar DB Server on AWS](https://github.com/scalar-labs/scalar-kubernetes/blob/master/docs/ManualDeploymentGuideScalarDBServerOnEKS.md)
- [Deploy Scalar DB Server on Azure](https://github.com/scalar-labs/scalar-kubernetes/blob/master/docs/ManualDeploymentGuideScalarDBServerOnAKS.md)

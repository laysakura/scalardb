package com.scalar.db.storage.dynamo;

import com.scalar.db.api.DistributedStorage;
import com.scalar.db.api.DistributedStorageAdmin;
import com.scalar.db.api.DistributedStorageProvider;
import com.scalar.db.config.DatabaseConfig;

public class DynamoProvider implements DistributedStorageProvider {
  @Override
  public String getName() {
    return "dynamo";
  }

  @Override
  public DistributedStorage createDistributedStorage(DatabaseConfig config) {
    return new Dynamo(config);
  }

  @Override
  public DistributedStorageAdmin createDistributedStorageAdmin(DatabaseConfig config) {
    return new DynamoAdmin(config);
  }
}

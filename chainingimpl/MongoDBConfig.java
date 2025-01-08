package chainingimpl;

public class MongoDBConfig {
    private final String username;
    private final String password;
    private final int port;
    private final boolean readPrimaryPreferred;
    private final String ssl;
    private final String dbName;
    private final String collectionName;
    private final long connectionTimeout;

    private MongoDBConfig(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.port = builder.port;
        this.ssl = builder.ssl;
        this.readPrimaryPreferred = builder.readPrimaryPreferred;
        this.dbName = builder.dbName;
        this.collectionName = builder.collectionName;
        this.connectionTimeout = builder.connectionTimeout;
    }

    @Override
    public String toString() {
        return "setterimplementation.MongoDBConfig{" +
                "dbName='" + dbName + '\'' +
                ", collectionName='" + collectionName + '\'' +
                '}';
    }


    public static class Builder {
        private final String username;
        private final String password;
        private final int port;
        private boolean readPrimaryPreferred;
        private String ssl;
        private String dbName;
        private String collectionName;
        private long connectionTimeout;

        public Builder(String username, String password, int port) {
            this.username = username;
            this.password = password;
            this.port = port;
        }

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        public Builder collectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }

        public Builder ssl(String ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder isReadPrimaryPreferred(boolean isReadPrimaryPreferred) {
            this.readPrimaryPreferred = isReadPrimaryPreferred;
            return this;
        }

        public Builder connectionTimeout(long connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public MongoDBConfig build() {
            return new MongoDBConfig(this);
        }
    }
}

public class MongoDBConfig {
    private final String username;
    private final String password;
    private final int port;
    private final boolean readPrimaryPreferred;
    private final String ssl;
    private final String dbName;
    private final String collectionName;
    private final long connectionTimeout;

    public MongoDBConfig(Builder builder) {
        this.username = builder.getUsername();
        this.password = builder.getPassword();
        this.port = builder.getPort();
        this.ssl = builder.getSsl();
        this.readPrimaryPreferred = builder.isReadPrimaryPreferred();
        this.dbName = builder.getDbName();
        this.collectionName = builder.getCollectionName();
        this.connectionTimeout = builder.getConnectionTimeout();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPort() {
        return port;
    }

    public boolean isReadPrimaryPreferred() {
        return readPrimaryPreferred;
    }

    public String getSsl() {
        return ssl;
    }

    public String getDbName() {
        return dbName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public long getConnectionTimeout() {
        return connectionTimeout;
    }

    @Override
    public String toString() {
        return "MongoDBConfig{" +
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

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public int getPort() {
            return port;
        }

        public boolean isReadPrimaryPreferred() {
            return readPrimaryPreferred;
        }

        public String getSsl() {
            return ssl;
        }

        public String getDbName() {
            return dbName;
        }

        public String getCollectionName() {
            return collectionName;
        }

        public long getConnectionTimeout() {
            return connectionTimeout;
        }

        public void setSsl(String ssl) {
            this.ssl = ssl;
        }

        public void setReadPrimaryPreferred(boolean readPrimaryPreferred) {
            this.readPrimaryPreferred = readPrimaryPreferred;
        }

        public void setDbName(String dbName) {
            this.dbName = dbName;
        }

        public void setCollectionName(String collectionName) {
            this.collectionName = collectionName;
        }

        public void setConnectionTimeout(long connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
        }
    }
}

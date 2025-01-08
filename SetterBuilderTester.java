public class SetterBuilderTester {
    public static void main(String[] args) {
        MongoDBConfig.Builder builder = new MongoDBConfig.Builder("dinesh", "password", 27017);
        builder.setDbName("databaseName");
        builder.setCollectionName("collectionOne");
        builder.setSsl("SSLString");
        builder.setConnectionTimeout(60); //seconds
        builder.setReadPrimaryPreferred(false); //read from slave machines
        MongoDBConfig config = new MongoDBConfig(builder);
        System.out.println(config.toString());
    }
}

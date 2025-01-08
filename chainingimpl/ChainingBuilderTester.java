package chainingimpl;

public class ChainingBuilderTester {
    public static void main(String[] args) {
        MongoDBConfig config = new MongoDBConfig.Builder("dinesh", "password", 27017)
                .dbName("databaseName")
                .collectionName("collectionOne")
                .ssl("SSLString")
                .connectionTimeout(60) //seconds
                .isReadPrimaryPreferred(false) //read from slave machines
                .build();

        System.out.println(config.toString());
    }
}

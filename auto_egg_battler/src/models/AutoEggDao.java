package models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;


public class AutoEggDao {
    private final DynamoDBMapper dynamoDbMapper;

    /**
     * Instantiates an AlbumTrackDao object.
     *
     * @param dynamoDbMapper the {@link DynamoDBMapper} used to interact with the album_track table
     */
    public AutoEggDao(DynamoDBMapper dynamoDbMapper) {
        this.dynamoDbMapper = dynamoDbMapper;
    }
}
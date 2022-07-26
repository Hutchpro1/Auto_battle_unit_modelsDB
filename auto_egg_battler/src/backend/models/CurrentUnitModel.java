package backend.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;
@DynamoDBTable(tableName =" current_unit_model_table")
public class CurrentUnitModel {

    private String unitId;
    private String name;
    private String boardLocation;
    private Integer maxHealth;
    private Integer maxDefence;
    private Integer maxAttackDamage;
    private List<String> itemIds;

    @DynamoDBHashKey(attributeName = "unitId")
    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    @DynamoDBRangeKey(attributeName = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute(attributeName = "boardLocation")
    public String getBoardLocation() {
        return boardLocation;
    }

    public void setBoardLocation(String boardLocation) {
        this.boardLocation = boardLocation;
    }

    @DynamoDBAttribute(attributeName = "maxHealth")
    public Integer getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(Integer maxHealth) {
        this.maxHealth = maxHealth;
    }

    @DynamoDBAttribute(attributeName = "maxDefence")
    public Integer getMaxDefence() {
        return maxDefence;
    }

    public void setMaxDefence(Integer maxDefence) {
        this.maxDefence = maxDefence;
    }

    @DynamoDBAttribute(attributeName = "maxAttackDamage")
    public Integer getMaxAttackDamage() {
        return maxAttackDamage;
    }

    public void setMaxAttackDamage(Integer maxAttackDamage) {
        this.maxAttackDamage = maxAttackDamage;
    }

    @DynamoDBAttribute(attributeName = "itemIds")
    public List<String> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<String> itemIds) {
        this.itemIds = itemIds;
    }
}

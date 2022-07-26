package backend.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName =" item_model_table")
public class ItemModel {

    private String name;
    private Integer healthMod;
    private Integer defenceMod;
    private Integer attackDamageMod;

    @DynamoDBHashKey(attributeName = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute(attributeName = "healthMod")
    public Integer getHealthMod() {
        return healthMod;
    }

    public void setHealthMod(Integer healthMod) {
        this.healthMod = healthMod;
    }

    @DynamoDBAttribute(attributeName = "defenceMod")
    public Integer getDefenceMod() {
        return defenceMod;
    }

    public void setDefenceMod(Integer defenceMod) {
        this.defenceMod = defenceMod;
    }

    @DynamoDBAttribute(attributeName = "attackDamageMod")
    public Integer getAttackDamageMod() {
        return attackDamageMod;
    }

    public void setAttackDamageMod(Integer attackDamageMod) {
        this.attackDamageMod = attackDamageMod;
    }
}

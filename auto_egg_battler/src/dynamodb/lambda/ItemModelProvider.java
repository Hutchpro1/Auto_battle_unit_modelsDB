package dynamodb.lambda;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import models.requests.ItemModelRequest;
import models.requests.UnitModelRequest;

@DynamoDBTable(tableName = "ItemModelTable")
public class ItemModelProvider implements RequestHandler<ItemModelRequest, UnitModelRequest> {

    private String name;
    private Integer healthMod;
    private Integer defenceMod;
    private Integer attackDamageMod;

    private Integer attackSpeedMod;


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

    @DynamoDBAttribute(attributeName = "attackSpeedMod")
    public Integer getAttackSpeedMod() {
        return attackSpeedMod;
    }

    public void setAttackSpeedMod(Integer attackSpeedMod) {
        this.attackSpeedMod = attackSpeedMod;
    }

    @Override
    public UnitModelRequest handleRequest(ItemModelRequest input, Context context) {
        return null;
    }
}

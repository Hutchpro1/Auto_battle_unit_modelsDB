package backend.models;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;

import java.sql.Array;

@DynamoDBTable(tableName ="UnitModelTable")
public class UnitModel {
    private String name;
    private Integer health;
    private Integer defence;
    private Integer attackDamage;

//    private Integer[]  unitArr = new Integer[];
//
//    public Integer[] getUnitArr() {
//        return unitArr;
//    }
//
//    public void setUnitArr(Integer[] unitArr) {
//        this.unitArr = unitArr;
//    }

    @DynamoDBHashKey(attributeName = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute(attributeName = "health")
    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    @DynamoDBAttribute(attributeName = "defence")
    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    @DynamoDBAttribute(attributeName = "attackDamage")
    public Integer getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(Integer attackDamage) {
        this.attackDamage = attackDamage;
    }
}

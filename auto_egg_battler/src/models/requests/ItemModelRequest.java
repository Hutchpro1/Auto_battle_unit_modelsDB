package models.requests;

import java.util.Objects;

public class ItemModelRequest {

    private String name;

    private Integer healthMod;

    private Integer defenceMod;

    private Integer attackDamageMod;

    private Integer attackSpeedMod;

    public ItemModelRequest(String name, Integer healthMod, Integer defenceMod, Integer attackDamageMod, Integer attackSpeedMod) {
        this.name = name;
        this.healthMod = healthMod;
        this.defenceMod = defenceMod;
        this.attackDamageMod = attackDamageMod;
        this.attackSpeedMod = attackSpeedMod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealthMod() {
        return healthMod;
    }

    public void setHealthMod(Integer healthMod) {
        this.healthMod = healthMod;
    }

    public Integer getDefenceMod() {
        return defenceMod;
    }

    public void setDefenceMod(Integer defenceMod) {
        this.defenceMod = defenceMod;
    }

    public Integer getAttackDamageMod() {
        return attackDamageMod;
    }

    public void setAttackDamageMod(Integer attackDamageMod) {
        this.attackDamageMod = attackDamageMod;
    }

    public Integer getAttackSpeedMod() {
        return attackSpeedMod;
    }

    public void setAttackSpeedMod(Integer attackSpeedMod) {
        this.attackSpeedMod = attackSpeedMod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemModelRequest that = (ItemModelRequest) o;
        return Objects.equals(name, that.name) && Objects.equals(healthMod, that.healthMod) && Objects.equals(defenceMod, that.defenceMod) && Objects.equals(attackDamageMod, that.attackDamageMod) && Objects.equals(attackSpeedMod, that.attackSpeedMod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, healthMod, defenceMod, attackDamageMod, attackSpeedMod);
    }

    public static final class Builder {
        private String name;
        private String healthMod;
        private Integer defenceMod;

        private Integer attackDamageMod;

        private Integer attackSpeedMod;

        private Builder() {

        }

        public  ItemModelRequest.Builder withName(String nameToUse) {
            this.name = nameToUse;
            return this;
        }

        public  ItemModelRequest.Builder withHealthMod(String healthModToUse) {
            this.healthMod = healthModToUse;
            return this;
        }

        public  ItemModelRequest.Builder withDefenceMod(int defenceModToUse) {
            this.defenceMod = defenceMod;
            return this;
        }

        public  ItemModelRequest.Builder withAttackDamageMod(int attackDamageModToUse) {
            this.attackDamageMod = attackDamageModToUse;
            return this;
        }

        public  ItemModelRequest.Builder withAttackSpeedMod(int attackSpeedModToUse) {
            this.attackSpeedMod = attackSpeedModToUse;
            return this;
        }

    }


}

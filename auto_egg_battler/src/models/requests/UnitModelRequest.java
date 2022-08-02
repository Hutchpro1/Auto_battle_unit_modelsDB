package models.requests;

import com.amazonaws.internal.config.Builder;

import java.util.Objects;

public class UnitModelRequest {
    private String name;
    private Integer health;
    private Integer defence;
    private Integer attackDamage;

    public UnitModelRequest(String name, Integer health, Integer defence, Integer attackDamage) {
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.attackDamage = attackDamage;
    }

    public UnitModelRequest(Builder builder) {
        this.name = builder.name;
        this.health = Integer.valueOf(builder.health);
        this.defence = builder.defence;
        this.attackDamage = builder.attackDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(Integer attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitModelRequest that = (UnitModelRequest) o;
        return Objects.equals(name, that.name) && Objects.equals(health, that.health) && Objects.equals(defence, that.defence) && Objects.equals(attackDamage, that.attackDamage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, defence, attackDamage);
    }

    public static Builder builder() {return new Builder();}

    public static final class Builder {
        private String name;
        private String health;
        private Integer defence;
        private Integer attackDamage;

        private Builder() {

        }

        public Builder withName(String nameToUse) {
            this.name = nameToUse;
            return this;
        }

        public Builder withHealth(String healthToUse) {
            this.health = healthToUse;
            return this;
        }

        public Builder withDefence(int defenceToUse) {
            this.defence = defence;
            return this;
        }

        public Builder withAttackDamage(int attackDamageToUse) {
            this.attackDamage = attackDamageToUse;
            return this;
        }

    }
}

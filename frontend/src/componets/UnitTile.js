import React from 'react'

const UnitTile = ({image, name, health, defense, attackDamage, ability}) => {
  return (
    <div id='Tile'>
      <span><img id='UnitImage' src={image} width="350" height="460"></img></span>
      <span>
        <div>{name}</div>
        <div>Health: {health}</div>
        <div>Defence: {defense}</div>
        <div>Attack: {attackDamage}</div>
        <div>Ability: {ability}</div>
      </span>
    </div>
  )
}

export default UnitTile

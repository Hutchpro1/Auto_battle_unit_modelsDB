import React from 'react'

const ItemTile = ({image, name, health, defense, attackDamage, attackSpeed}) => {
  return (
    <div id='Tile'>
      <span><img src={image}></img></span>
      <span>
        <div>{name}</div>
        <div>Health Moddifer: {health}</div>
        <div>Defence Moddifer: {defense}</div>
        <div>Attack Moddifer: {attackDamage}</div>
        <div>Attack Speed Moddifer: {attackSpeed}</div>
      </span>
    </div>
  )
}

export default ItemTile

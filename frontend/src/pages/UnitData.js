import React from 'react'
import UnitTile from '../componets/UnitTile'

const UnitData = (unitData) => {

  console.log(unitData)

  return (
    <div id='TileGrid'>
      {unitData.unitData.map(unitData => <UnitTile 
        name={unitData.name}
        health={unitData.health}
        defense={unitData.defense}
        attackDamage={unitData.attack}
        image={unitData.image}
        ability={unitData.abilty}
      />)}
    </div>
  )
}

export default UnitData

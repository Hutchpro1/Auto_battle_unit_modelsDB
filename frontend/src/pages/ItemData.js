import React from 'react'
import ItemTile from '../componets/ItemTile'

const ItemData = () => {
  return (
    <div id='TileGrid'>
      <ItemTile 
       name={'Shield'} health={'0'} defense={'30'} attackDamage={'0'} attackSpeed={'0'}/>
      <ItemTile 
       name={'Sword'} health={'0'} defense={'0'} attackDamage={'20'} attackSpeed={'0'}/>
      <ItemTile 
       name={'Dagger'} health={'0'} defense={'0'} attackDamage={'0'} attackSpeed={'15'}/>
      <ItemTile 
       name={'Belt'} health={'100'} defense={'0'} attackDamage={'0'} attackSpeed={'0'}/>
    </div>
  )
}

export default ItemData

import React from 'react'
import LeaderTile from '../componets/LeaderTile'

const LeaderBoard = ({State, LoginName}) => {
  return (
    <div>
      <LeaderTile name={'Dataheart'} Rank={'1'} Score={'8743'}/>
      <LeaderTile name={'Cloudmani'} Rank={'2'} Score={'7535'}/>
      <LeaderTile name={'Deadraina'} Rank={'3'} Score={'7245'}/>
      <LeaderTile name={'Defstorma'} Rank={'4'} Score={'6153'}/>
      <LeaderTile name={'Geoshocka'} Rank={'5'} Score={'5111'}/>
      <LeaderTile name={'Backrushe'} Rank={'6'} Score={'4897'}/>
      <LeaderTile name={'Chromarei'} Rank={'7'} Score={'4885'}/>
      <LeaderTile name={'Bluelusters'} Rank={'8'} Score={'4333'}/>
    </div>
  )
}

export default LeaderBoard

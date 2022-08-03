import React from 'react'

const LeaderTile = ({name, Rank, Score}) => {
  return (
    <div id='LeaderTile'>
        <span>Rank:{Rank}</span>
        <span>.........{name}.........</span>
        <span>Score:{Score}</span>
    </div>
  )
}

export default LeaderTile

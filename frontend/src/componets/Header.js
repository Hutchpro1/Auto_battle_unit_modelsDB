import React from 'react'

const Header = ({State, LoginName, Update}) => {
  return (
    <div>
      <button onClick={ClickButton}></button>
    </div>
  )

  function ClickButton() {
    State = 'login'
    console.log({State})
    Update(State)
  }
}

export default Header

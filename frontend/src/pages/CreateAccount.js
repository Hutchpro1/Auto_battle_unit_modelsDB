import React from 'react'

const CreateAccount = ({user, setUser}) => {
  return (
    <div>
        <form  onSubmit={() => SubmitUser()}>
          <div>Username: <input type="text" /></div>
          <div>Password: <input type="password" /></div>
          <div>Confirm: <input type="password" /></div>
          <div>E-Mail: <input type="text" /></div>
          <div><input type="submit" value='Login'/></div>
        </form>
    </div>
  )

  function SubmitUser(userName) {
    console.log("userName")
    setUser(userName)
  }
}

export default CreateAccount

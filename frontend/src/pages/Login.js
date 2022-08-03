import React from 'react'

const Login = ({user, setUser}) => {
  return (
    <div>
        <form  onSubmit={() => SubmitUser()}>
          <div>Username: <input type="text" /></div>
          <div>Password: <input type="password" /></div>
          <div><input type="submit" value='Login'/></div>
        </form>
    </div>
  )

  function SubmitUser(userName) {
    console.log("userName")
    setUser(userName)
  }
}

export default Login

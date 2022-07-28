import React from 'react'

const Login = ({State, LoginName}) => {
  return (
    <div>
        <div id='UserNameField'>
            <label>Username: </label>
            <input></input>
        </div>
        <div id='PasswordField'>
            <label>Password: </label>
            <input></input>
        </div>
    </div>
  )
}

export default Login

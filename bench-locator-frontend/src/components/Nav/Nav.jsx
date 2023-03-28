import React from 'react'
import './Nav.scss'
import benchLogo from "../../assets/images/benchLogo.png"

const Nav = () => {
  return (
    <div className='nav'>
      <img src={benchLogo} alt="" />
        <a href="">Bench Locator</a>
    </div>
  )
}

export default Nav
import React from 'react'
import './Card.scss'
import { Link } from "react-router-dom";



const Card = (props) => {
    const {number, location, address, postcode, times, city, isTwentyFourHours,id} = props

    let isOpen
    let openColour

    if (isTwentyFourHours == true) {
        isOpen = "Open today"
        openColour = "card__green-open"
    } else{
        isOpen = "Closed today"
        openColour = "card__red-closed"
    }
    
  return (
    <div className= 'card'>
            <h1 className='card__list-number'>{number}</h1>
        <div className='card__overview'>
            <h2 className='card__title'>{location}</h2>
            <p className='card__address'>{address}, {city}</p>
            <p className='card__postcode'>{postcode}</p>
            <div className='card__details'>
                <p className='card__opening'><span className={openColour}>{isOpen}</span> {times}</p>
                <p className='card__links'>
                    <a href="">Map</a> | 
                    <Link to={`/bench/${id}`} key = {id}>
                        <a href=""> Bench Details</a>
                    </Link>
                </p>
            </div>
        </div>
    </div>
  )
}

export default Card
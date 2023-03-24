import React from 'react'
import './Card.scss'

const Card = (props) => {
    const {number, location, address, postcode, times, city, isTwentyFourHours} = props

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
        <h2 className='card__title'>{location}</h2>
        <p className='card__address'>{address}, {city}</p>
        <p className='card__postcode'>{postcode}</p>
        <div>
            <p className='card__opening'><span className={openColour}>{isOpen}</span> {times}</p>
            <p className='card__links'><a href="">Map</a> | <a href="">Bench Details</a></p>
        </div>
    </div>
  )
}

export default Card
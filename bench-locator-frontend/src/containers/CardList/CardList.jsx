import React from 'react'
import { Link } from "react-router-dom";
import Card from '../../components/Card/Card';

const CardList = (props) => {
    const {benchArr} = props
    let interval = 0


    const cardsListJSX = benchArr.map((bench) => {
            interval++
        return ( 
        <Link to={`/bench/${bench.id}`} key = {bench.id}>
        <Card
              number = {interval}
              location = {bench.address} // remove numbers from address and anything after a comma
              address = {bench.address}
              city = {bench.city}
              postcode = {bench.postcode}
              times = {bench.time}
              isTwentyFourHours = {bench.twentyFourHourAccess}
              />
        </Link>
          )
      })

  return (
    <div>
        <div className="card-list">{cardsListJSX}</div>
    </div>
  )
}

export default CardList
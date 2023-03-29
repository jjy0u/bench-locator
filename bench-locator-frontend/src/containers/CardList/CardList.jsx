import React from 'react'
import Card from '../../components/Card/Card';
import './CardList.scss'

const CardList = (props) => {
    const {benchArr} = props
    let interval = 0


    const cardsListJSX = benchArr.map((bench) => {
            interval++
        return ( 
        <Card
              number = {interval}
              location = {bench.address} // remove numbers from address and anything after a comma
              address = {bench.address}
              city = {bench.city}
              postcode = {bench.postcode}
              times = {bench.time}
              isTwentyFourHours = {bench.twentyFourHourAccess}
              id = {bench.id}
              />
          )
      })

  return (
    <div>
        <div className="card-list">{cardsListJSX}</div>
    </div>
  )
}

export default CardList
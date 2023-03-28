import React from 'react'
import './Main.scss'
import CardList from '../../containers/CardList/CardList'
import map from "../../assets/images/map.jpg"


const Main = (props) => {
    const {benchArr, inputLocation} = props

  return (
    <div className='main'>
      <h3 className='main__heading'>Closest benches that match your search: "{inputLocation}"</h3>
      <div className='main__bench-location'>
        <div className='main__img-container'>
          <img className='main__image' src={map} alt="map" />
        </div>
        <div>
            <CardList benchArr = {benchArr}/>
        </div>
      </div>
    </div>
  )
}

export default Main
import React from 'react'
import CardList from '../../containers/CardList/CardList'

const Main = (props) => {
    const {benchArr} = props

  return (
    <div>
        <CardList benchArr = {benchArr}/>
    </div>
  )
}

export default Main
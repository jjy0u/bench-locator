import { useState } from "react";
import "./Form.scss";

const Form = ({ defaultFormState, handleSubmit }) => {
  const [bench, setBench] = useState(defaultFormState);

  const handleValidation = event => {
    event.preventDefault();

    if (Object.values(bench).some(value => !value)) {
      alert("Missing content, unable to proceed");
      return;
    }

    handleSubmit(bench);
  };

  return (
    <div className="form">
      <h2 className="form__title">Bench Details</h2>
      <form className="form__form" onSubmit={handleValidation}>
        <label htmlFor={bench.address1}>Address</label>
        <input
          className="form__input"
          type="text"
          value={bench.address1}
          id = {bench.address1}
          placeholder="Line 1"
          onInput={event => setBench({ ...bench, address1: event.target.value })}
        />
        <input
          className="form__input"
          type="text"
          value={bench.address2}
          id = {bench.address2}
          placeholder="Line 2"
          onInput={event => setBench({ ...bench, address2: event.target.value})}
        />

        <label htmlFor={bench.city}>City</label>
        <input
          className="form__input"
          type="text"
          value={bench.city}
          id = {bench.city}
          onInput={event => setBench({ ...bench, city: event.target.value })}
        />

        <label htmlFor={bench.postcode}>Postcode</label>
        <input
          className="form__input"
          type="text"
          value={bench.postcode}
          id = {bench.postcode}
          onInput={event => setBench({ ...bench, postcode: event.target.value })}
        />
        <label htmlFor={bench.twentyFourHourAccess}>24 Hour Access?</label>
        <select
          className="form__input"
          type="select"
          value={bench.twentyFourHourAccess}
          id = {bench.twentyFourHourAccess}
          onInput={event => setBench({ ...bench, twentyFourHourAccess: event.target.value })}>
            <option value={true}>Yes</option>
            <option value={false}>No</option>
        </select>
        {!bench.twentyFourHourAccess && <div className="form__opening-hours">
            <label htmlFor="Time">Opening Hours:</label>
            <input
            className="form__input"
            type="time"
            value={bench.openingTime}
            id = "Time"
            onInput={event => setBench({ ...bench, openingTime: event.target.value })}
            />
            <p>to</p>
            <input
            className="form__input"
            type="time"
            value={bench.closingTime}
            id = "Time"
            onInput={event => setBench({ ...bench, closingTime: event.target.value })}
            />
        </div>}

        <label htmlFor={bench.shaded}>Shaded?</label>
        <select
          className="form__input"
          type="select"
          value={bench.shaded}
          id = {bench.shaded}
          onInput={event => setBench({ ...bench, shaded: event.target.value })}>
            <option value={true}>Yes</option>
            <option value={false}>No</option>
        </select>

        <label htmlFor={bench.picnicTable}>Picnic table?</label>
        <select
          className="form__input"
          type="select"
          value={bench.picnicTable}
          id = {bench.picnicTable}
          onInput={event => setBench({ ...bench, picnicTable: event.target.value })}>
            <option value={true}>Yes</option>
            <option value={false}>No</option>
        </select>

        {/* view, accessibility, capacity, engraved message, memorial bench, bench image */}
        
        <button type="submit" className="form__button">
          Submit
        </button>
      </form>
    </div>
  );
};

export default Form;

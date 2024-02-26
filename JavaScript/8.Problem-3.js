var details = {
  name: "vinay",
  age: 25,
  city: "Bangalore",
};

// -----------------------------------------------------------------------
const getDetails = (details) => {
  const { name, ...rest } = details; // eslint-disable-line no-unused-vars
  return rest;
};
console.log(getDetails(details)); // Outputs {age: 25,

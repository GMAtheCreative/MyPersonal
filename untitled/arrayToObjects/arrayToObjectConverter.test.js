const arrayToObjects = require('./arrayToObjectConverter.js');

test("that i pass in an array and it returns an object of concorent numbers", ()=>{
    let input = [1,1,2,3,2];
    let result = arrayToObjects(input);
    let expected = {"1":2, "2":2, "3":1};
    expect(expected).toEqual(result);
})
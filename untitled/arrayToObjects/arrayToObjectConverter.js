function arrayToObjects(array) {
    let result = {};
    for (let index = 0; index < array.length; index++) {
        const value = array[index];
        if (value in result){
            result[index] = result[index]+1;
        }
        else{
            result[index] = 1;
        }
    }
    return result;
}
module.exports = arrayToObjects;
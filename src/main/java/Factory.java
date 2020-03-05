public class Factory {

    //method to help use create an object based on input
    // must return a add or multiply object

    public Calculate getCorrectObj(String operator){

        Calculate newObject = null;

        if(operator.contains("+")){
            newObject = new Add();
        }else {
            newObject = new Multiply();
        }
        return newObject;
    }
}

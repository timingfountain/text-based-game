//Random import is a random number generation utility
import java.util.Random;


//main class which holds all code
public class Main {
    //scenes
    static String SceneCave = "Cave";
    static String SceneForest = "Forest";
    static String SceneDesert = "Desert";






    public static void SceneGen(){

        //method for random number generation
        Random sceneGen = new Random();

        //variable for random number generation
        int SceneNumber = sceneGen.nextInt(2);


            //if loops to designate your scene
            if (SceneNumber == 0){
                System.out.println("You have entered a " + SceneCave);

            }
            else if (SceneNumber == 1){
                System.out.println("you have entered a " + SceneForest);

            }
            else if (SceneNumber == 2){
                System.out.println("You have entered a " + SceneDesert);

            }









        }








    public static void main(String[] args){
        //calling method SceneGen to automate Scene creation
        SceneGen();




    }







}

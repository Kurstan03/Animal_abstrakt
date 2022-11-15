package cow;

public class Main {
    public static void main(String[] args) {
        Cow[] cows = {
                new Cow(100,7,"m","zoi"),
                new Cow(150,12,"f","Nellie"),
                new Cow(115,10,"f","Bessie"),
                new Cow(90,8,"m","Dottie"),
                new Cow(145,13,"f","Clarabelle"),
        };
        Sheep[] sheeps = {
                new Sheep(32,3,"m","Tinkerbell"),
                new Sheep(27,4,"f","Ella"),
                new Sheep(20,2,"m","Luna"),
        };
        Horse[] horses = {
                new Horse(176,8,"m","Kara baiyr"),
                new Horse(230,13,"m","Gerkules"),
                new Horse(211,9,"m","Besh sary"),
        };
        Farm farm1 = new Farm("USA",cows,horses,sheeps,"Tony");

        Farm farm2 = new Farm("KG",cows[0],horses[2],sheeps[1],"Henry");

    }
}

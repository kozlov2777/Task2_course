package broadcasting;

import java.util.ArrayList;

public class TaskFactory implements BroadcastingFactory {
    private Double duration =18600.0; // 5 часов єто 18К секунд
    Broadcasting broadcasting = new Broadcasting.Builder().numOfAdvertising(3).numOfInterview(2).numOfSong(30).build();
    @Override
    public ArrayList<Interview> createPaidInterview() {
        ArrayList<Interview> interviews = new ArrayList<>();
        interviews.add(new Interview("Гордон",5550.0));
        interviews.add(new Interview("Шустер",5550.0));
        return interviews;
    }

    @Override
    public ArrayList<Advertising> createPaidAdvertising() {
        ArrayList<Advertising> advertisings = new ArrayList<>();
        advertisings.add(new Advertising("JetBrains",500.0));
        advertisings.add(new Advertising("GeeksForLess", 500.0));
        advertisings.add(new Advertising("GlobalLogic",500.0));
        return  advertisings;


    }

    @Override
    public ArrayList<Song> createNoPaid() {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Артем Токарев","Седьмой лепесток", 180.0));
        songs.add(new Song("Ляпис Трубетской","Воины света", 180.0));
        songs.add(new Song("Соседи стерпят","Девочка панк", 180.0));
        songs.add(new Song("Квест пистолс","Ты так красива", 180.0));
        songs.add(new Song("Григорий Лепс","Она не твоя", 180.0));
        songs.add(new Song("Михаил Круг","Девочка пай", 180.0));
        songs.add(new Song("Тарас Чубай","Вона", 180.0));
        songs.add(new Song("Пица","Оружие", 180.0));
        songs.add(new Song("Макс Корж","Шантаж", 180.0));
        songs.add(new Song("Агата Кристи","Как на войне", 180.0));
        return songs;
    }

    public void TaskOne(){
        if (broadcasting.getNumOfInterview()*createPaidInterview().get(1).duration()+ broadcasting.getNumOfAdvertising()*createPaidAdvertising().get(1).duration()>broadcasting.getNumOfSong()*createNoPaid().get(1).duration()) {
            System.out.println("Платного контенту більше 50%!!!!!!!!");
        }else {
            System.out.println("Платного контету меньше 50%");
        }

    }
    public void TaskTwo(){
        if (broadcasting.getNumOfInterview()*createPaidInterview().get(1).duration()+ broadcasting.getNumOfAdvertising()*createPaidAdvertising().get(1).duration()+broadcasting.getNumOfSong()*createNoPaid().get(1).duration()>duration){
            System.out.println("Перевищення ліміту часу!!!!!!");
        }else {
            System.out.println("Ліміт часу в нормі");
        }

    }

    public void TaskThree(){
        ArrayList<String> advertisingSongArrayList = new ArrayList<>();
        sortSing(advertisingSongArrayList);
        advertisingSongArrayList.add(createPaidAdvertising().get(0).name());
        advertisingSongArrayList.add(createPaidInterview().get(0).name());
        sortSingTwo(advertisingSongArrayList);
        advertisingSongArrayList.add(createPaidAdvertising().get(1).name());
        advertisingSongArrayList.add(createPaidInterview().get(1).name());
        advertisingSongArrayList.add(createPaidAdvertising().get(2).name());
        System.out.println(advertisingSongArrayList);

    }

    public  void sortSing(ArrayList advertisingSongArrayList){
        for (int i = 0; i < 5; i++) {
            advertisingSongArrayList.add(createNoPaid().get(i).SongName());
        }
    }
    public  void sortSingTwo(ArrayList advertisingSongArrayList){
        for (int i = 6; i < 10; i++) {
            advertisingSongArrayList.add(createNoPaid().get(i).SongName());
        }
    }


}

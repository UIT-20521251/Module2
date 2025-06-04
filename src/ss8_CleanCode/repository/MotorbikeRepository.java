package ss8_CleanCode.repository;

import ss8_CleanCode.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository {
    private List<Motorbike> motorbikes = new ArrayList<>();

    public void add(Motorbike motorbike){
        motorbikes.add(motorbike);
    }
    public void remove(Motorbike motorbike){
        motorbikes.remove(motorbike);
    }
    public void getAllMotorbikes(){
        for(Motorbike motorbike: motorbikes){
            System.out.println(motorbike.toString());
        }
    }
}

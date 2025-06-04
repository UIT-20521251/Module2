package ss8_CleanCode.repository;

import ss8_CleanCode.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository {
    private List<Motorbike> motorbikes = new ArrayList<>();

    public void add(Motorbike motorbike){
        motorbikes.add(motorbike);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class WorkQueue {
    private ArrayList<WorkRequest> wrkReqList;

    public WorkQueue() {
        wrkReqList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWrkReqList() {
        return wrkReqList;
    }
    
    
    
}

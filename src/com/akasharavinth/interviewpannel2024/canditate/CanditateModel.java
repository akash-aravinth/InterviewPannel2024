package com.akasharavinth.interviewpannel2024.canditate;

import com.akasharavinth.interviewpannel2024.datalayer.DataManagement;
import com.akasharavinth.interviewpannel2024.models.Canditates;

public class CanditateModel {

    private DataManagement dataManagement;

    private CanditateView canditateView;
    CanditateModel(CanditateView canditateView){
        this.canditateView = canditateView;
    }

    public void giveCanditateInfo(String canditateName, long canditatePhoneNo, String canditateEmailId, String canditateAddress) {
        Canditates canditates = new Canditates();
        canditates.setCanditateName(canditateName);
        canditates.setCanditatePhoneNo(canditatePhoneNo);
        canditates.setCanditateEmailId(canditateEmailId);
        canditates.setCanditateAddress(canditateAddress);
        canditates.setId();
        DataManagement.getInstance().addCanditate(canditates);
    }
}

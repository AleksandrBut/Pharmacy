package com.netcracker.group5.pharmacy.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Override
    public List<Long> performPurchase(List<Long> purchaseItemIdList) {
        ArrayList<Long> acceptedPurchasesIdList = new ArrayList<>(purchaseItemIdList.size());

        for (Long id : purchaseItemIdList) {
            double randValue = (Math.random() * 10);

            if (randValue < 7) {
                acceptedPurchasesIdList.add(id);
            }
        }

        acceptedPurchasesIdList.trimToSize();
        return acceptedPurchasesIdList;
    }
}

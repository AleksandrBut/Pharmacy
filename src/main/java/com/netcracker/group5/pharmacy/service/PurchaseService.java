package com.netcracker.group5.pharmacy.service;

import java.util.List;

public interface PurchaseService {
    List<Long> performPurchase(List<Long> purchaseItemIdList);
}

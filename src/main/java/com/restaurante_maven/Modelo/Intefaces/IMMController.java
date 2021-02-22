/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante_maven.Modelo.Intefaces;

import com.restaurante_maven.Modelo.Principal.Client;
import com.restaurante_maven.Modelo.Principal.Order;
import java.time.LocalDateTime;

/**
 *
 * @author migue
 */
public interface IMMController {
    public Order newOrder(Client c, LocalDateTime d);
    public Order changeOrder(Client c);
    public Order changeOrder(LocalDateTime d);
    public Order changeOrder(Client c,LocalDateTime d);
    public boolean deleteOrder(Client c);
    public boolean deleteOrder(Client c, LocalDateTime d);
    public boolean deleteOrder(LocalDateTime d);
    public int cashToday();
    public int cashThisMonth();
    public int cashTotal();
    public void viewOrdersNotPayed();
    public void viewOrdersPendingDelivered();
    public void saveAllAndClose();
}

package com.nss.javaDemo.ticketCancel;

import java.util.Date;

public interface CancelPolicy {
    Double ticketCancellation(Ticket ticket, Date cancellationTime);
}

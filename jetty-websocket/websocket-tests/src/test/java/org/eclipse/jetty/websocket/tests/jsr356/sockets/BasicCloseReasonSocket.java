//
//  ========================================================================
//  Copyright (c) 1995-2017 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.websocket.tests.jsr356.sockets;

import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value="/echo/close/reason")
public class BasicCloseReasonSocket extends TrackingSocket
{
    @OnClose
    public void onClose(CloseReason reason)
    {
        addEvent("onClose(%s)", reason);
        closeLatch.countDown();
    }
}

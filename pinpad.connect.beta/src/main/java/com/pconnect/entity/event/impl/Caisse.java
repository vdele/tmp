/**
 *
 */
package com.pconnect.entity.event.impl;

import com.pconnect.entity.event.Event;


/**
 * @author 20002845
 * @date Nov 16, 2015
 * 
 */
public class Caisse extends Event
{

    /* (non-Javadoc)
     * @see com.pconnect.entity.event.Event#activeEvent()
     */
    @Override
    public void activeEvent() {
        board.showMsgBox("Hello I'm a caisse");
    }

}


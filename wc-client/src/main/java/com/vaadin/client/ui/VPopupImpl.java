/*
 * Copyright 2000-2014 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.client.ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.impl.PopupImpl;

public class VPopupImpl extends PopupImpl {

//    @Override
    public void onShow(Element popup) {
        // Move the overlay to the appropriate overlay container
        final VOverlay overlay = VOverlay.current;
        if (overlay != null) {
            final Element e = overlay.getOverlayContainer();
            e.appendChild(popup);
        }

//        super.onShow(popup);
    }

}

/**
 * Copyright 2015 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.comcast.magicwand.spells.web.safari;

import com.comcast.magicwand.wizards.WizardFactory;
import com.comcast.magicwand.builders.PhoenixDriverIngredients;
import com.comcast.magicwand.drivers.PhoenixDriver;

public class SafariWizardFactory implements WizardFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoenixDriver create(PhoenixDriverIngredients ingredients) {
        SafariPhoenixDriver pd = new SafariPhoenixDriver();

        if (pd.verify(ingredients)) {
            return pd;
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getWizardFactoryName() {
        return this.getClass().getSimpleName();
    }
}

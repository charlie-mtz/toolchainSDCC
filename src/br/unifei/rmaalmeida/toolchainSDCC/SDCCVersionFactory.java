/*
    SDCC Toolchain allows MPLABX to compile with SDCC+GPUtils for pic 16/18
    Copyright (C) 2011  Rodrigo Maximiano Antunes de Almeida

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package br.unifei.rmaalmeida.toolchainSDCC;
import com.microchip.crownking.opt.Version;
/**
 *
 * @author rmaalmeida
 */
public class SDCCVersionFactory implements Version.Factory  {
    /**
     * <p>This factory interface enables a client to instantiate extensions to
     * the <code>Version</code> class without having to know the name of the
     * particular extending class.
     */
    @Override
    public SDCCVersion create(String s) {
        return new SDCCVersion(s);
    }
}

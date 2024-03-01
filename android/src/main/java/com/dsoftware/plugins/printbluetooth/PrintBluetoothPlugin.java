package com.dsoftware.plugins.printbluetooth;

import android.Manifest;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;

@CapacitorPlugin(name = "PrintBluetooth", permissions = { @Permission(alias = "BLUETOOTH", strings = { Manifest.permission.BLUETOOTH }) })
public class PrintBluetoothPlugin extends Plugin {

    private PrintBluetooth implementation = new PrintBluetooth();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

     @PluginMethod
    public void blPrint(PluginCall call) {
        JSObject ret = new JSObject();
        String value = call.getData().getString("value");
        if (value == null || value == "") {
            implementation.DisplayMessage(getContext(), "Debe proporcionar algun valor que imprimir");
            return;
        }
        ret.put("value", implementation.blPrint(getContext(), value));
        call.resolve(ret);
    }

    @PluginMethod
    public void testingMessage(PluginCall call) {
        String value = call.getData().getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.testingMessage(getContext(), value));
        call.resolve(ret);
    }

    @PluginMethod
    public void getNotifications(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", implementation.getNotifications(getContext(), "Hola"));
        call.resolve(ret);
    }
}

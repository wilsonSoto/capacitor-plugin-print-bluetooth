import { WebPlugin } from '@capacitor/core';

import type { PrintBluetoothPlugin } from './definitions';

export class PrintBluetoothWeb extends WebPlugin implements PrintBluetoothPlugin {
  testingMessage(): boolean {
    console.log('Imprimiendo desde la web');
    return true;
  }
  getNotifications(): boolean {
    console.log('Imprimiendo desde la web');
    return true;
  }
  blPrint(options: { value: string; }): boolean {
    console.log(options)
    console.log(options.value)
    return true
  }
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

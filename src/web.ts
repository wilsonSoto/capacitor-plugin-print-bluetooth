import { WebPlugin } from '@capacitor/core';

import type { PrintBluetoothPlugin } from './definitions';

export class PrintBluetoothWeb extends WebPlugin implements PrintBluetoothPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

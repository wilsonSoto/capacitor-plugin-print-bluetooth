import { registerPlugin } from '@capacitor/core';

import type { PrintBluetoothPlugin } from './definitions';

const PrintBluetooth = registerPlugin<PrintBluetoothPlugin>('PrintBluetooth', {
  web: () => import('./web').then(m => new m.PrintBluetoothWeb()),
});

export * from './definitions';
export { PrintBluetooth };
